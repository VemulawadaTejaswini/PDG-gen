import java.util.*;

public class Main {

        
    public static void main(String[] args) {    	                 
            Scanner  sc = new Scanner(System.in);        
            
            int N = sc.nextInt();
            
            int K = sc.nextInt();
            int L = sc.nextInt();
            
            UnionFind road    = new UnionFind(N);
            UnionFind railway = new UnionFind(N);
            
            for(int i = 0;i < K;i++){
                road.union(sc.nextInt()-1 ,sc.nextInt() - 1);
            }            
            
            for(int i = 0;i < L;i++){
                railway.union(sc.nextInt() - 1,sc.nextInt() - 1);                
            }

            Map<Long,Integer> count = new HashMap<>();
            
            for(int i = 0;i < N;i++){
                  long key = (long) road.find(i)*N + railway.find(i);
                  if(count.containsKey(key))
                      count.put(key,count.get(key) + 1);  
                  else
                      count.put(key,1);
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < N;i++){
                 long key = (long) road.find(i)*N + railway.find(i);
                 sb.append(count.get(key)).append(" ");                                                  
            }            
                          
            System.out.println(sb);
    }
    
    static class UnionFind{
        int parent[];
        int rank[];
        
        UnionFind(int n){
            parent = new int[n];
            rank   = new int[n];            
            for(int i = 0;i < n;i++){
                parent[i] = i;
                  rank[i] = 0;
            }            
        }
        
        public int find(int x){
           if(parent[x] == x)
              return x;
           else
              return parent[x] = find(parent[x]);
        }                
        
        boolean same(int x,int y){
            return find(x) == find(y);
        }                                        

        public void union(int x,int y){
            x = find(x);
            y = find(y);
            
            if(x != y){
                if(rank[x] > rank[y]){
                     parent[y] = x;                    
                }else{                                        
                     parent[x] = y;
                    if(rank[x] == rank[y]){
                        rank[y]++;                        
                    }                    
                }                                                              
            }
            
            return;
        }        
        
        public int count(){
            int count = 0;
            for(int i = 0;i < parent.length;i++){                
                if(i == parent[i]){
                    count++;
                }
            }                       
            return count;
        }          
        
    }     
    
}
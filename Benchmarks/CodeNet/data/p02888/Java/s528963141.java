import java.util.*;
public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long counter=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
        	pq.add(sc.nextInt());
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
        	ar.add(pq.poll());	//大きい順に並ぶ
        }
        for(int i=0;i<n-2;i++){
        	int c=ar.remove(0);
            int size=ar.size();
            for(int j=0;j<size-1;j++){              
            	int b=ar.get(j);
                if(2*b<c)break;
                for(int k=j+1;k<size;k++){
                	int a=ar.get(k);
                    if(c<a+b){
                    	counter++;
                    }else{
                    	break;
                    }
                }
            }
        }
        
        System.out.println(counter);
    }
}
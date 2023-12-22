import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                
                for(int i=1; i<=N;i++){
                    int A = scan.nextInt();
                    list.add(A);
                }              
                Collections.sort(list);
                
                for(int i=list.size()-1;i>=1;i--){
                    if(Objects.equals(list.get(i), list.get(i-1))){
                        int p = i;
                        while(Objects.equals(list.get(p), list.get(p-1))){
                            list.remove(p);
                            p--;
                            i--;
                            if(p==0){
                                break;
                            }
                        }
                        list.remove(p);
                    }
                    else{
                        for(int j=0; j<list.size();j++){
                            if(list.get(j)>list.get(i)/2){
                                break;
                            }else{
                                if(list.get(i)%list.get(j)==0){
                                    list.remove(i);
                                    break;
                                }
                            }
                        }
                    }
                } 
                System.out.println(list.size());                
        }
}
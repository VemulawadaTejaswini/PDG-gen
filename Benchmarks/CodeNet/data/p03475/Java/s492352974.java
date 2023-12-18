import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        List<Integer> cList=new ArrayList();
        List<Integer> sList=new ArrayList();
        List<Integer> fList=new ArrayList();
        for(int i=0;i<N-1;i++){
            cList.add(scanner.nextInt());
            sList.add(scanner.nextInt());
            fList.add(scanner.nextInt());
        }
        for(int i=0;i<N-1;i++){
            int result=cList.get(i)+sList.get(i);
            for(int j=1+i;j<N-1;j++){
                int k=calNextStartTime(result,sList.get(j),fList.get(j));
                result=k;
                result+=cList.get(j);
            }
            
            System.out.println(result);
        }
        System.out.println(0);
    }
    public static int calNextStartTime(int currentTime, int startTime, int termTime){
        if(currentTime<=startTime){
            return startTime;
        }else{
            if((currentTime-startTime)%termTime==0){
                return startTime+termTime*((currentTime-startTime)/termTime);
            }else{
                return startTime+termTime*((currentTime-startTime)/termTime+1);
            }
        }
    }
}

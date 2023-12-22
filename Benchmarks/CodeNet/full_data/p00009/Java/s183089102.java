import java.util.*;

public class Main {
    static int[] list=new int[1000000];
    
    static void start(){
        for(int i=2;i<1000;i++){
            if(list[i]==-1)continue;
            for(int j=2;i*j<1000000;j++){
                list[i*j]=-1;
            }
        }
    }
    
    static int fun(int n){
        int c=0;
        for(int i=n;i>=2;i-=1){
            if (list[i]==0){c+=1;continue;}
            if(list[i]>0){c+=list[i];break;}
        }
        list[n]=c;return c;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        start();
        while(sc.hasNext()){System.out.println(fun(sc.nextInt()));}
    
    }   
}

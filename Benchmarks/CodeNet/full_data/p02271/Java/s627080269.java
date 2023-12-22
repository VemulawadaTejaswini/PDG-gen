
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] aArray=new int[n];
        for(int i=0;i<n;i++){
            aArray[i]=scanner.nextInt();
        }
        int q=scanner.nextInt();
        int[] qArray=new int[q];
        for(int i=0;i<q;i++){
            qArray[i]=scanner.nextInt();
        }
        boolean[] booleans=new boolean[2000*20];
        int[] result=new int[(int)Math.pow(2,n)];
        for(int i=0;i<n;i++){
            for(int j=0;j<result.length;j++){
                int r=(int)Math.pow(2,n-i-1);
                if(j/r%2==0){
                    result[j]+=aArray[i];
                }
            }
        }
        Arrays.stream(result).forEach((i)->{
            booleans[i]=true;
        });
        for(int i=0;i<qArray.length;i++){
            if(booleans[qArray[i]]){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }



    }

}


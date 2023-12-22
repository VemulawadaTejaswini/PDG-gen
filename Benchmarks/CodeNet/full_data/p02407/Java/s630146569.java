import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] arr;
        int n=0;
         
        while((str=br.readLine())!=null){
            if(n==0){
                n=Integer.parseInt(str);
                continue;
            }
            arr=str.split(" ");
            int[] array=new int[n];
 
            for(int i=1;i<=n;i++){
            	array[n-i] = Integer.parseInt(arr[n-i]);
                System.out.print(array[n-i]);
                if(i!=n) System.out.print(" ");
            }
            break;
        }
        System.out.println("");
        br.close();
    }
}
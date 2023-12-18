
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            a2[i]=scanner.nextInt();
        }
        int index=0;
        int max=cal(a1,a2,index);
        index++;
        for(int i=1;i<n;i++){
            int next=cal(a1,a2,index);
            if(max<next){
                max=next;
            }
            index++;
        }
        System.out.println(max);


    }
    public static int cal(int[] a1,int[] a2,int index){
        int result=0;
        for(int i=0;i<=index;i++){
            result+=a1[i];
        }
        for(int i=index;i<a1.length;i++){
            result+=a2[i];
        }
        return result;
    }
}

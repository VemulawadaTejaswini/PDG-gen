import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int [] a=new int[3];
       for(int i=0;i<3;i++){
        a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       for(int i=0;i<3;i++){
           if(i==2)System.out.printf("%d\n",a[i]);
       else System.out.print(a[i]+" ");
       }

}
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[100000];
        int i=0;
        while(true){
            a[i]=scan.nextInt();
            if(a[i]==0){
                break;
            }
            System.out.println("Case "+(i+1)+":"+" "+a[i]);
            i++;
        }
    }
}

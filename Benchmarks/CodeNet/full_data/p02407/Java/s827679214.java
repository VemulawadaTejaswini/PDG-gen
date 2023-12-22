import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int count,i;
            int a[];
            a = new int[100000];
            Scanner n = new Scanner(System.in);
            count = n.nextInt();
            for(i=0;i<count;i++){
                a[i] = n.nextInt();
            }
            for(i=count-1;i>=0;i--){
                if(i==0){
                    System.out.printf("%d",a[i]);
                }else{
                    System.out.printf("%d ",a[i]);
                }
            }
            System.out.printf("\n");
    }
}

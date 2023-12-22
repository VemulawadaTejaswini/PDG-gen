import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        for (int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        if (a[0]==1&&a[1]==1){
            System.out.println("Open");
        }else if (a[2]==1){
            System.out.println("Open");
        }else{
            System.out.println("Close");
        }
    }
}
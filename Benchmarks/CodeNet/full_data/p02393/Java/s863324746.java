import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int [3];
        int place;
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        if(a[0]>a[1]){
            place=a[0];
            a[0]=a[1];
            a[1]=place;
        }
        if(a[1]>a[2]){
            place=a[1];
            a[1]=a[2];
            a[2]=place;
        }
        if(a[0]>a[1]){
            place=a[0];
            a[0]=a[1];
            a[1]=place;
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}


import java.util.Scanner;
//0630
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt(),s=0;
        System.out.println(a<=0?a*-c+d+e*b:(b-a)*e);
    }
}

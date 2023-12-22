import java.util.Scanner;


/* ITP1_1_C
 * class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int area = a*b;
        int around = (a+b)*2;

        System.out.println(area + " " + around);
    }
}*/

/*// ITP1_1_D
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int h = S/3600;
        int m = (S%3600)/60;
        int s = S%60;

        System.out.println(h + ":" + m + ":" + s);
    }
}*/


// ITP1_2_A:   Small, Large, or Equal
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
        	System.out.println("a < b");
        }else if(a>b){
        	System.out.println("a > b");
        }else{
        	System.out.println("a == b");
        }

    }
}

import java.util.*;


public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        String[] arr =  n.split("");
        int num = Integer.parseInt(arr[arr.length - 1]);
//        System.out.println(num);
        switch(num){
            case 3:
                System.out.println("bon");
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            default:
                System.out.println("hon");
                break;
        }
    }
}
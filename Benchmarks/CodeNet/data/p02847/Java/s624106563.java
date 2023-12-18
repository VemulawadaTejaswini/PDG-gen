import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        if(str.equals("SUN")){
            System.out.println(7);
        }
        if(str.equals("MON")){
            System.out.println(6);
        }
        if(str.equals("TUE")){
            System.out.println(5);
        }
        if(str.equals("WED")){
            System.out.println(4);
        }
        if(str.equals("THU")){
            System.out.println(3);
        }
        if(str.equals("FRI")){
            System.out.println(2);
        }
        if(str.equals("SAT")){
            System.out.println(1);
        }
        scan.close();
    }
}
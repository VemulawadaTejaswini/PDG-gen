import java.util.Scanner; 
class Main {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
     int y = scan.nextInt();
     int area = x * y;
     int perimeter =(2 * x) + (2 * y);
     System.out.println(area + " " + perimeter);
  }
}

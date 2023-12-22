import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=0;
    int b=0;
    int o=0;
    int ab=0;
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] arr = line.split(",");
      if(arr[1].equals("A")) {
        a++;
      }
      else if(arr[1].equals("B")) {
        b++;
      }
      else if(arr[1].equals("O")) {
	o++;
      }
      else if(arr[1].equals("AB")) {
	ab++;
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(ab);
    System.out.println(o);
  }
}
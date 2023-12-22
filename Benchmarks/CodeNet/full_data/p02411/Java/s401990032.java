import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<String[]>();
        while(true) {
          String line = sc.nextLine();
          String[] linesp = line.split(" ");
          
          if(linesp[0].equals("-1") && linesp[1].equals("-1") && linesp[2].equals("-1")) {
              break;
          }
          list.add(linesp);
        }
      
        for(int i = 0; i < list.size(); i++) {
        int m = Integer.parseInt(list.get(i)[0]);
        int n = Integer.parseInt(list.get(i)[1]);
        int r = Integer.parseInt(list.get(i)[2]);
        if(m == -1 || n == -1) {
            System.out.println("F");
        } else {
            if(m + n >= 80) {
                System.out.println("A");
            } else if(m + n >= 65) {
                System.out.println("B");
            } else if(m + n >= 50) {
                System.out.println("C");
            } else if(m + n >= 30) {
                if(r >= 50) {
                    System.out.println("C");
                }else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
        }
        
        }
      
  }
}

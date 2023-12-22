import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String[] data = new String[8];
      for(int i=0; i<8; i++) {
        data[i] = sc.nextLine();
      }
      for(int i=0; i<8; i++) {
        for(int j=0; j<8; j++) {
          if(data[i].charAt(j)=='0') {
            continue;
          }
          if(i<7&&j<7) {
            if(data[i+1].charAt(j)=='1' && data[i].charAt(j+1)=='1' && data[i+1].charAt(j+1)=='1') {
              System.out.println("A");
              continue;
            }
          }
          if(i<5) {
            if(data[i+1].charAt(j)=='1' && data[i+2].charAt(j)=='1' && data[i+3].charAt(j)=='1') {
              System.out.println("B");
              continue;
            }
          }
          if(j<5) {
            if(data[i].charAt(j+1)=='1' && data[i].charAt(j+2)=='1' && data[i].charAt(j+3)=='1') {
              System.out.println("C");
              continue;
            }
          }
          if(i<6&&0<j) {
            if(data[i+1].charAt(j)=='1' && data[i+1].charAt(j-1)=='1' && data[i+2].charAt(j-1)=='1') {
              System.out.println("D");
              continue;
            }
          }
          if(i<7&&j<6) {
            if(data[i].charAt(j+1)=='1' && data[i+1].charAt(j+1)=='1' && data[i+1].charAt(j+2)=='1') {
              System.out.println("E");
              continue;
            }
          }
          if(i<6&&j<7) {
            if(data[i+1].charAt(j)=='1' && data[i+1].charAt(j+1)=='1' && data[i+2].charAt(j+1)=='1') {
              System.out.println("F");
              continue;
            }
          }
          if(i<7&&0<j&&j<7) {
            if(data[i].charAt(j+1)=='1' && data[i+1].charAt(j)=='1' && data[i+1].charAt(j-1)=='1') {
              System.out.println("G");
              continue;
            }
          }
        }
      }
    }
  }
}
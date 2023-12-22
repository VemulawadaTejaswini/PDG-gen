import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        while(true){
          int blank = 0;
          String[] Array = n.split("");
          for(int i = 0; i<n.length(); i++){
            blank += Integer.parseInt(Array[i]);
          }
          if(blank == 0)
          break;
          System.out.println(blank);
          n = sc.nextLine();
        }
      }
    }


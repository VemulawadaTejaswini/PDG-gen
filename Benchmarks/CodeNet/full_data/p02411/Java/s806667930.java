import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    int i = 0;
    int m[] = new int [50];
    int f[] = new int [50];
    int r[] = new int [50];

    while(true){
        m[i] = sc.nextInt();
        f[i] = sc.nextInt();
        r[i] = sc.nextInt();
        if(m[i] == -1 && f[i] == -1 && r[i] == -1) break;
        i++;
    }

    int times = 0;

    while(times<i){
      if(m[times] == -1 || f[times] == -1) System.out.printf("F\n");
      else if(m[times] + f[times] >= 80) System.out.printf("A\n");
      else if(m[times] + f[times] >=65 && m[times] + f[times] <80) System.out.printf("B\n");
      else if(m[times] + f[times] >=50 && m[times] + f[times] <65) System.out.printf("C\n");
      else if(m[times] + f[times] >=30 && m[times] + f[times] <50) {
        if(r[times] >= 50) System.out.printf("C\n");
        else System.out.printf("D\n");
      }
      else if(m[times] + f[times] < 30) System.out.printf("F\n");
      times++;
    }
  }
}


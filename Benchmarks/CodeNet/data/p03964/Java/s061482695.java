import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    long takahashi = 0l;
    long aoki = 0l;
    long t_i = 0l;
    long a_i = 0l;
    long count = 1l;

    for(int i=0; i<N; i++){
      t_i = Long.parseLong(scanner.next());
      a_i = Long.parseLong(scanner.next());

      while(true){
        if(t_i*count>=takahashi && a_i*count>=aoki){
          takahashi = t_i * count;
          aoki = a_i * count;
          count = 0l;
          break;
        }else{
          count ++;
        }
      }
    }

    System.out.println(takahashi + aoki);
  }
}

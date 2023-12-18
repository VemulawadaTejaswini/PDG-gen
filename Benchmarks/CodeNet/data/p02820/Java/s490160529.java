import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long N=scan.nextLong();
    long K=scan.nextLong();
    long R=scan.nextLong();
    long S=scan.nextLong();
    long P=scan.nextLong();
    scan.nextLine();
    String[] T=scan.nextLine().split("");
    String[] before=new String[N];
    long count=0;
    for(long i=0;i<N;i++){
      if(i-K<0){
        if(T[i].equals("r")){
          before[i]="p";
          count+=P;
        }
        else if(T[i].equals("s")){
          before[i]="r";
          count+=R;
        }
        else if(T[i].equals("p")){
          before[i]="s";
          count+=S;
        }
      }
      else{
        if(T[i].equals("r")){
          if(before[i-K].equals("p")){
            before[i]="r";
            count+=0;
          }else{
            before[i]="p";
            count+=P;
          }
        }
        if(T[i].equals("p")){
          if(before[i-K].equals("s")){
            before[i]="p";
            count+=0;
          }else{
            before[i]="s";
            count+=S;
          }
        }
        if(T[i].equals("s")){
          if(before[i-K].equals("r")){
            before[i]="s";
            count+=0;
          }else{
            before[i]="r";
            count+=R;
          }
        }
      }
    }
    System.out.println(count);
  }
}
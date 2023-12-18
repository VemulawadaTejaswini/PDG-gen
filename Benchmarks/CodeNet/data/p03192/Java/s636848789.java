import java.io.*;
 class Main {
 public static void main(String[] args) throws IOException {
 BufferedReader br;
 br=new BufferedReader(new InputStreamReader(System.in));
int target=Integer.parseInt(br.readLine());
 int man = target / 1000;
 int sen = target / 100 % 10;
 int hyaku = target / 10 % 10;
 int iti = target % 10;
 int count = 0;
 if(man == 2) { count++;}
 if(sen == 2) {count++;}
 if(hyaku == 2) { count++;}
if(iti == 2) { count++;}
 System.out.println(count); }
}
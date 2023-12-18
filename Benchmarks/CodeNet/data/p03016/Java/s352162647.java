import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long n = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();
  long m = sc.nextLong();
  long sum = 0;
  int keta = 0;
  long ans = 0;
  long cst = (long)(Math.pow(10,10)) % m;
  long csts = (long)(Math.pow(cst,10)) % m;
  long cstt = (long)(Math.pow(csts,10)) % m;
  long cstq = (long)(Math.pow(cstt,10)) % m;
  long tmpans = 0;
  for(long i = n-1; i >= 0;i--){
    long tmp = a + b*i; 
    long amarif = ((a % m) + (b % m)*(i % m)%m)%m;
    long ketaf = keta/10;
    long ketas = keta % 10;
    
    long ketaff = ketaf/10;
    long ketass = ketaf % 10;
    
    long ketafff = ketaff/10;
    long ketasss = ketaff/10;
    
    long ketaffff = ketafff/10;
    long ketassss = ketafff/10;
    
    long amarib = (long)(Math.pow(cstq, ketaffff)) % m;
    
    long amaria = (long)(Math.pow(cstt, ketassss)) % m;
    long amariq = (long)(Math.pow(csts, ketasss)) % m;
    long amaris = (long)(Math.pow(cst, ketass)) % m;
    long amarit = (long)(Math.pow(10, ketas)) % m;
    long amarik = (amarif * amaris) % m;
    long amaril = (amarik * amariq) % m;
    long amarim = (amaril * amaria) % m;
    long amarin = (amarim * amarib) % m;
    ans += (amarin * amarit) % m;
    keta += String.valueOf(tmp).length(); 
  }
  System.out.println(ans % m);
}}
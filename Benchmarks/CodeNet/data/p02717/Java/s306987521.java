public static void main(String[] args){
int a,b,c;
  
  Scanner input=new Scanner(System.in);
 a=input.nextInt(); b=input.nextInt(); c=input.nextInt();
  int tempa=a;
  int tempb=b;
  int tempc=c;
  
  a=tempc;
  b=tempa;
c=tempa;
  System.out.printf("%d %d %d", a,b,c);
}
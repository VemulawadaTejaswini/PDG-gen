Class Main{
public static void main(String...args){
Scanner sc= new Scanner(System.in);
char C= sc.nextChar();  
int ascii = (int) C;
  ascii++;
  C= (char) ascii;
  System.out.println(C);
}
}
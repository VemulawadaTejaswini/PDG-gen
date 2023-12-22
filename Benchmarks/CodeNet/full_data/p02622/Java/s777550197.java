import scanner;
Scanner sc=new Scanner(System.in);  

String x = sc.nextLine();
String y = sc.nextLine();
int counter = 0;

for(int i = 0 ; i < x.length(); i++){
  if(! x.charAt(i).equals(y.charAt(i))){
    counter++;
  }
}
System.out.println(counter);
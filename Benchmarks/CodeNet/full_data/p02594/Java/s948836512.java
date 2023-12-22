public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  String str = scanner.nextLine();
  int input = Integer.parseInt(str);

  if (input >= 30) println("Yes");
  else println("No");
}

public static void println(String msg){
  System.out.println(msg);
}

Scanner scan = new Scanner(System.in);

String s_str = scan.nextLine();
String t_str = scan.nextLine();

if(s_str.equals(t_str)){
  System.out.print(0);
} else {
  String[] sArray = s_str.split("");
  String[] tArray = t_str.split("");
  int cnt = 0;
  
  for(int i = 0; i < sArray.length; i++){
    if(!sArray[0].equals(tArray[0])){
      cnt++;
    }
  }
  System.out.print(cnt);
}
public static void main(String[] args) {
  int D = 1000;
  int S = 80;
  int T = 11;
  String time = int(D / S);

  if(time <= T){
      System.out.println('Yes');
  }else{
      System.out.println('No');
  }
}
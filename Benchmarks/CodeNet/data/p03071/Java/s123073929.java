class AButtons{
  static int answer(int a, int b) {
    int answer = 0;
    for(int i = 0; i < 2; i++) {
      if(a>=b) {
        answer += a;
        a--;
      }else {
        answer += b;
        b--;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println(answer(a, b));
  }
}

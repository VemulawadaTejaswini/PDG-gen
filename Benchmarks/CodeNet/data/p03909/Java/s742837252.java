class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt(), W = sc.nextInt();
    String[][] S = new String[H][W];
    ansH = -1,ansW = -1;
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        S[i][j] = s.next();
        if(S[i][j].equals("snuke")){
          ansH = i;
          ansW = j;
        }
      }
    }
    System.out.println(char("A"+j)+(i+1))
  }
}
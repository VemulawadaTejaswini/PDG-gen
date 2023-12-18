class Main{
  static int single(int n){
    int count = 0; int sum = 0;
    for(int i = 1; sum < 40000 ; i++) {
      sum = n * i;
      count++;
    }
    return count;
  }

  static int nico(int m, int n){
    int sum = 0; int count = 0;
    for (int i = 1 ; sum < 40000 ; i++) {
      m = m * i;
      sum = m;
      if(sum == 40000) break;
      for (int j = 1 ; sum < 40000 ; j++ ) {
        n = n * j;
        sum = m + n;
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int a = 500, b = 100, c = 50;

    int count = single(a) + single(b) + single(c) + nico(a, b) + nico(a, c) + nico(b, c);



    System.out.println(count);
  }
}

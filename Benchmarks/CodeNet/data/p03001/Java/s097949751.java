class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int w = Integer.parseInt(sc.next());
      int h = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      
      double half = (double)w*h / 2; 
      
      double centerX = (double)w / 2;
      double centerX = (double)h / 2;
      
      if (x == centerX && y == centerY) {
        System.out.println(half + ' ' + 1);
      } else {
        System.out.println(half + ' ' + 0);
      }
      
}
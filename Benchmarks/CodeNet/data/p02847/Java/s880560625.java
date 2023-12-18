public static class Holiday{
	public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
      System.out.println("Enter one of these day to find how many day is the next sunday");
      Sytem.out.println("SUN, MON, TUE, WED, THU, FRI or SAT");
      String day = input.next();
      switch(day){
        case 'SUN':
          System.out.println("7");
          break;
        case 'MON':
          System.out.println("6");
          break;
        case 'TUE':
          System.out.println("5");
          break;
        case 'WED':
          System.out.println("4");
          break;
        case 'THU':
          System.out.println("3");
          break;
        case 'FRI':
          System.out.println("2");
          break;
        case 'SAT':
          System.out.println("1");
          break;
        default:
          System.out.println("invalid");
      }
    }
}
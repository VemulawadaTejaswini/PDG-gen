import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
    String s = Integer.toString(A);
    char ch[] = s.toCharArray();
    ArrayList<Character> a = new ArrayList<>();
    for(int i = 0 ; i < ch.length; i++){
      if(!a.contains(ch[i])){
        a.add(ch[i]);
      }
    }
    if(a.size()<= 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}

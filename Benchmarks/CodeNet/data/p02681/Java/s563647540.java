public class Main {
	public static void main(String[] args) {
      string s = "No";
      string t = "Yes";
      t = t+1;
      System.out.println("s:"+s.ToString());
       System.out.println("t:"+t.ToString());
      if(t.equals(s)){
        System.out.println("[equals]条件一致");
      }
      else{
      System.out.println("[equals]条件不一致");
      }
    }
}
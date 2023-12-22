import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> ans = new ArrayList<Integer>();

    for(int i=0; i<n; i++) {
      int tmp = sc.nextInt();
      a.add(tmp);
    }

    Collections.sort(a);
/*
      for(int i=0; i<n; i++) {
      System.out.println(a.get(i));
    }
*/

    for(int i=0; i<n; i++) {
      boolean f = false;
      for(int w=0; w<i; w++) {
        if(i == w){
          continue;
        }
        if(a.get(i) % a.get(w) == 0) {
          f = true;
          break;
        }
        if((a.get(i)/2 > a.get(w)) {
          break;
        }
      }// for w
      if(f == false) {
        ans.add(a.get(i));
      }
    }//for i
    int answer = ans.size();
    if(a.get(0) == a.get(1)) {
      answer = 0;
    }
    System.out.println(answer);

	}
}

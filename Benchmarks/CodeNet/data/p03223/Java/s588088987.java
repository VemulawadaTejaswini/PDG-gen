import java.util.*;

class Main {
	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

      //start from an empty list
      result.add(new ArrayList<Integer>());

      for (int i = 0; i < num.length; i++) {
          //list of list in current iteration of the array num
          ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

          for (ArrayList<Integer> l : result) {
              // # of locations to insert is largest index + 1
              for (int j = 0; j < l.size()+1; j++) {
                  // + add num[i] to different locations
                  l.add(j, num[i]);

                  ArrayList<Integer> temp = new ArrayList<Integer>(l);
                  current.add(temp);

                  //System.out.println(temp);

                  // - remove num[i] add
                  l.remove(j);
              }
          }

          result = new ArrayList<ArrayList<Integer>>(current);
      }

      return result;
  }

  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int lines = Integer.parseInt(sc.nextLine());
    int[] arr = new int[lines];

    for(int i=0; i<lines; i++) {
        arr[i] = Integer.parseInt(sc.nextLine());
    }

    System.out.println(Main.calcMax(Main.permute(arr)));
  }

  public static int calcMax(ArrayList<ArrayList<Integer>> ar) {
  	int max = 0;
  	for(ArrayList<Integer> i: ar) {
      int tmp = 0;
      for(int n=0; n<i.size(); n++) {
      	if(n==0)
        	continue;
        tmp += Math.abs(i.get(n) - i.get(n - 1));
      }
      if(max < tmp)
      	max = tmp;
    }
    return max;
  }
}
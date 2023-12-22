import java.util.*;

class Main{
  public static ArrayList<int[]> perm(int n){
    int[] num = new int[n];
    boolean[] flag = new boolean[n];
    ArrayList<int[]> arrList = new ArrayList<int[]>();
    permCalc(0,num,flag,arrList);
    return arrList;
  }

  public static void permCalc(int rank, int[] num, boolean[] flag, ArrayList<int[]> arrList){
    if (rank == num.length) {
      arrList.add(num.clone());
    }
    else {
      for (int i = 0; i < num.length; i++) {
        if (!flag[i]) {
          num[rank] = i;
          flag[i] = true;
          permCalc(rank+1,num,flag,arrList);
          flag[i] = false;
        }
      }
    }
  }

  public static int ope(int a, int b, int operand){
    switch (operand) {
      case 0:
        return a+b;
      case 1:
        return a-b;
      default:
        return a*b;
    }
  }

  public static String opeToStr(int operand){
    switch (operand) {
      case 0:
        return "+";
      case 1:
        return "-";
      default:
        return "*";
    }
  }

  public static String check(int[] num, int[] op){
    int a = num[0];
    int b = num[1];
    int c = num[2];
    int d = num[3];
    if(ope(ope(ope(a,b,op[0]),c,op[1]),d,op[2]) == 10) {
      return "(("+a+" "+opeToStr(op[0])+" "+b+") "+opeToStr(op[1])+" "+c+") "+opeToStr(op[2])+" "+d;
    }
    else if(ope(ope(a,b,op[0]),ope(c,d,op[2]),op[1]) == 10) {
      return "("+a+" "+opeToStr(op[0])+" "+b+") "+opeToStr(op[1])+" ("+c+" "+opeToStr(op[2])+" "+d+")";
    }
    else if(ope(ope(a,ope(b,c,op[1]),op[0]),d,op[2]) == 10) {
      return "("+a+" "+opeToStr(op[0])+" ("+b+" "+opeToStr(op[1])+" "+c+")) "+opeToStr(op[2])+" "+d;
    }
    else if(ope(a,ope(ope(b,c,op[1]),d,op[2]),op[0]) == 10) {
      return a+" "+opeToStr(op[0])+" (("+b+" "+opeToStr(op[1])+" "+c+") "+opeToStr(op[2])+" "+d+")";
    }
    else if(ope(a,ope(b,ope(c,d,op[2]),op[1]),op[0]) == 10) {
      return a+" "+opeToStr(op[0])+" ("+b+" "+opeToStr(op[1])+" ("+c+" "+opeToStr(op[2])+" "+d+"))";
    }
    else {
      return null;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<int[]> arrList = perm(4);
    int[][] operand = new int[27][];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          int[] temp = {i,j,k};
          operand[9*i+3*j+k] = temp;
        }
      }
    }
    while(true) {
      int[] num0 = new int[4];
      for (int i = 0; i < 4; i++) {
        num0[i] = sc.nextInt();
      }
      if (num0[0] == 0 && num0[1] == 0 && num0[2] == 0 && num0[3] == 0) {
        break;
      }
      String chk = null;
      search:
      for (int i = 0; i < arrList.size(); i++) {
        int[] num = {num0[arrList.get(i)[0]],num0[arrList.get(i)[1]],
                     num0[arrList.get(i)[2]],num0[arrList.get(i)[3]]};
        for (int j = 0; j < operand.length; j++) {
          chk = check(num, operand[j]);
          if (chk != null) {
            break search;
          }
        }
      }
      if (chk == null) {
        System.out.println(0);
      }
      else {
        System.out.println(chk);
      }
    }
  }
}
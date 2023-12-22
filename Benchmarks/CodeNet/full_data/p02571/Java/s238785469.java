public class Main{
  public static void main(String[] args){
 
    Scanner	scn = new Scanner(System.in);
    System.ot.println("Sを入力してください");
    String S = scn.next();
    String[] strArraySubS = S.split("");
        String[] strArrayS = new String[S.length()];

    
    System.ot.println("Tを入力してください");
    String T = scn.next();
        String[] strArraySubS = S.split("");
    String[] strArrayT = new String[T.length()];

for (int i = 1; i < strArraySubS.length; i++) {
    strArrayS[i - 1] = strArraySub[i];
}
 
for (int i = 0; i < strArrayS.length; i++) {
    System.out.println("Sの" + i + "の番目：" + strArrayS[i]);
}
    
for (int i = 1; i < strArraySubT.length; i++) {
    strArrayT[i - 1] = strArraySub[i];
}
 
for (int i = 0; i < strArrayT.length; i++) {
    System.out.println("Tの" + i + "の番目：" + strArrayT[i]);
}
    
  }
}
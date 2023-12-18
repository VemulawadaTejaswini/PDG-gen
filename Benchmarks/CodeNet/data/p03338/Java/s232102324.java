import java.util.*;

class Main{
	int n;
  String s;
  

  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	n=Integer.parseInt(sc.nextLine());
    s=sc.nextLine();

    int result=0;
    for(int i=1;i<n;i++){
      //System.out.println(s.substring(0,i)+" "+s.substring(i));
      int count=countChar(s.substring(0,i),s.substring(i));
      if(result<count) result=count;
    }
    System.out.println(result);

    //System.out.println(countChar(s));
  }
  public int countChar(String str1,String str2){
    int c1[]=new int[26];
    int c2[]=new int[26];

    for(int i=0;i<str1.length();i++){
      c1[(int)str1.charAt(i)-97]=1;
    }

    for(int i=0;i<str2.length();i++){
      c2[(int)str2.charAt(i)-97]=1;
    }

    int sum=0;
    for(int i=0;i<26;i++){
      //System.out.println(c1[i]+" "+c2[i]);
      sum+=c1[i]*c2[i];
    }
    return sum;
  }
}
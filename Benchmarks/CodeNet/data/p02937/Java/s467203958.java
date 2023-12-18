import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
    String t=sc.nextLine();
    char[] ss=s.toCharArray();
    char[] tt=t.toCharArray();

    int[] s_sort=new int[26];Arrays.fill(s_sort,0);//文字別出現回数
	for(int i=0;i<ss.length;i++)s_sort[(int)ss[i]-97]++;
    int[] t_sort=new int[26];Arrays.fill(t_sort,0);
	for(int i=0;i<tt.length;i++)t_sort[(int)tt[i]-97]++;
 
	String sss=s;
   //突き合わせ
   	for(int i=0;i<26;i++){
      if(t_sort[i]>0 && s_sort[i]==0){
          		System.out.println(-1);
          		System.exit(0);
       }else if(t_sort[i]==0 && s_sort[i]>0){
		   sss=sss.replace(String.valueOf((char)(i+97)),"");
	   }
    }//とりあえず文字はあることを確認、tにないs文字を削除
  
  char[] scs=sss.toCharArray();
  
   //単純数え上げ
   long r=-1L; int it=0;
	StringBuilder ls = new StringBuilder();
   do{r++;ls.setLength(0);
   	for(int is=0;is<scs.length;is++){
    	if(tt[it]==scs[is]){
          ls.append(tt[it]);
          it++;if(it==tt.length)break;
        }
    }
   }while(it<tt.length);
   
   int r_mod=0;it=0;
   char[] scss=ls.toString().toCharArray();
   for(int is=0;is<ss.length;is++){
	   r_mod=is+1;
	   if(scss[it]==ss[is]){
		   it++;if(it==scss.length)break;
	   }
   }
   
	System.out.println(r*ss.length+r_mod);
 }
}

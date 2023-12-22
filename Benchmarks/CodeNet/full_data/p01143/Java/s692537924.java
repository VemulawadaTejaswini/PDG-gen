import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();  // テァツォツカテヲツ環?ィツ??」ツ?ョテ、ツコツコテヲツ閉ー
	    int m = kbd.nextInt();  // テ・ツ仰敕」ツ?」テ」ツ?淌、ツコツコテ」ツ?ョテァツ閉ェテ・ツ渉キ 
	    double p = kbd.nextInt();  // テヲツ篠ァテゥツ卍、テァツ篠?
	    if(!(n==0 && m==0 && p==0)){
		
		int[] a = new int[n];   // nテァツ閉ェテァツ崢ョテ」ツ?ョテ、ツコツコテ」ツ?ォティツウツュテ」ツ?妥」ツ?淌、ツコツコテヲツ閉ーテ」ツつ津、ツソツ敕・ツュツ?
		int i;
		int  money = 0;
		for(i=0; i<n; i++){
		    a[i] = kbd.nextInt();
		    money += a[i]*100;
		}
		// テ「ツ?僧oney = ティツウツュテ」ツ?妥ゥツ?妥」ツ?ョテァツキツ湘ゥツ。ツ?

		money -= money*(p/100);
		// テ「ツ?僧oney = テ・ツ渉療」ツ?妥・ツ渉姪」ツつ古」ツつ凝ヲツ慊?・ツ、ツァテゥツ?妥ゥツ。ツ?

		if(a[m-1]==0){
		    System.out.println("0");
		    // テ「ツ?妥ィツウツュテ」ツ?妥」ツ?淌、ツコツコテ」ツ?古・ツアツ?」ツ?ェテ」ツ?妥」ツつ古」ツ?ーテ・ツ渉療」ツ?妥・ツ渉姪」ツつ古」ツ?ェテ」ツ??
		}
		else {
		    money = money/a[m-1];
		    // テ「ツ?僧oney = テ、ツクツ?、ツコツコテ・ツスツ禿」ツ?淌」ツつ甘」ツ?ョテゥツ?催・ツスツ禿ゥツ??
		    System.out.println(money);
		}
	    }
	}
    }
}
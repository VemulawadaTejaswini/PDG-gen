import java.io.*;
import java.util.*;
import java.math.*;
/*
 連立方程式ax+b=c,dx+e=fの解を求める
 2013.6.8
*/
class Main {
    public static void main(String[] a) throws IOException{
	String output = new String();//出力の文字列
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str;
	//Enterが押されるまで処理を反復実行
	while  ((str= br.readLine())!=null){
	    if(str.indexOf(" ")!=-1)
		{
		   
		    double[] coeff = new double[6];//aからfまでの係数
		    int i;
		    StringTokenizer strCoeff = new StringTokenizer(str," ");//空白文字で分割
		    i = 0;
		    while(i<6)
			{
			    coeff[i] = Double.parseDouble(strCoeff.nextToken());
			    i++;
			}
		    double x,y,p,q;//y=p/q, p=af-cd, q=ae-bd, x=(cq-bp)/(aq)
		    p = coeff[0]*coeff[5]-coeff[2]*coeff[3];
		    q = coeff[0]*coeff[4]-coeff[1]*coeff[3];
		    if(coeff[0] != 0 && q != 0)
			{
			    x = (coeff[2]*q-coeff[1]*p)/(coeff[0]*q);
			    y = p/q;
			    BigDecimal bd1 = new BigDecimal(x);
			    BigDecimal bd2 = new BigDecimal(y);
			    BigDecimal bd1_hp = bd1.setScale(3,BigDecimal.ROUND_HALF_UP);
			    BigDecimal bd2_hp = bd2.setScale(3,BigDecimal.ROUND_HALF_UP);
			    output +=  bd1_hp + " " + bd2_hp + "\n";
			}
		    else
			{
			    output += "No answer\n";
			}
		}
	    else
		{
		    System.out.println(output);
		    System.exit(1);
		}
	}
    }
}
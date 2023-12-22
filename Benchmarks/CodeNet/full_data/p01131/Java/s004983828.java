import java.util.Scanner;

class Main{

    public static void main(String[] args){
	char[][] nb = {{'.',',','!','?',' '},//1 
		       {'a','b','c'},//2
		       {'d','e','f'},//3
		       {'g','h','i'},
		       {'j','k','l'},
		       {'m','n','o'},
		       {'p','q','r','s'},
		       {'t','u','v'},
		       {'w','x','y','z'}};
	String s;
	int n,cou=1;
	int sn=1;
	int[] aa = new int[1000];
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	for(int g=0;g<n;g++){
	    s = in.next();
	    char[] ch = s.toCharArray();
	    for(int i=0;i<s.length();i++){
		if(ch[i] != '0'){aa[i]=cou;
		    cou++;
		    continue;
		}
		if(ch[i] == '0'){aa[i]=0;
		    cou=1;
		    continue;
		}
	    }

	  

	    for(int i=0;i<s.length()-1;i++){
		if(aa[i+1] == 0){
		    if(ch[i] == '0'){}
		    else if(ch[i] == '1'){
			if(aa[i]%5 == 0){
			    System.out.print(nb[0][4]);
			}else{
			    System.out.print(nb[0][aa[i]%5-1]);
			}

		    }
		    else if(ch[i] == '7' || ch[i] == '9'){
			if(ch[i] == '1')sn=1;
			else if(ch[i] == '7')sn=7;
			else if(ch[i] == '9')sn=9;
			if(aa[i]%4 == 0){
			    System.out.print(nb[sn-1][3]);
			}else{
			    System.out.print(nb[sn-1][aa[i]%4-1]);
			}
		    }
		    else{
			if(ch[i] =='2')sn=2;
			else if(ch[i] == '3')sn=3;
			else if(ch[i] == '4')sn=4;
			else if(ch[i] == '5')sn=5;
			else if(ch[i] == '6')sn=6;
			else if(ch[i] == '8')sn=8;
			if(aa[i]%3 == 0){System.out.print(nb[sn-1][2]);
			}else{ 
			System.out.print(nb[sn-1][aa[i]%3-1]);
			}
		    }
		}

	    }
	    System.out.printf("\n");



	}






    }



}
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int Target = cin.nextInt();
        int mina=100,minb=100,minc=100,mind=100,mine=100,minf=100,ming=100,minh=100,mini=100,minj=100,mink=100,minl=100,minm=100,minn=100;
        int mino=100,minp=100,minq=100,minr=100,mins=100,mint=100,minu=100,minv=100,minw=100,minx=100,miny=100,minz=100;
        
        for(int i = 0;i<Target;i++){
        	String tmp = cin.nextLine();
        	int size = tmp.length();
            int counta=0,countb=0,countc=0,countd=0,counte=0,countf=0,countg=0,counth=0,counti=0,countj=0,countk=0,countl=0,countm=0,countn=0;
            int counto=0,countp=0,countq=0,countr=0,counts=0,countt=0,countu=0,countv=0,countw=0,countx=0,county=0,countz=0;
        	for(int j =0 ;j < size; j++){
        		switch(String.valueOf(tmp.charAt(j))){
        		case "a":
        			counta++;
        			break;
        		case "b":
        			countb++;
        			break;
        		case "c":
        			countc++;
        			break;
        		case "d":
        			countd++;
        			break;
        		case "e":
        			counte++;
        			break;
        		case "f":
        			countf++;
        			break;
        		case "g":
        			countg++;
        			break;
        		case "h":
        			counth++;
        			break;
        		case "i":
        			counti++;
        			break;
        		case "j":
        			countj++;
        			break;	
        		case "k":
        			countk++;
        			break;
        		case "l":
        			countl++;
        			break;	
        		case "m":
        			countm++;
        			break;
        		case "n":
        			countn++;
        			break;
        		case "o":
        			counto++;
        			break;	
        		case "p":
        			countp++;
        			break;	
        		case "q":
        			countq++;
        			break;	
        		case "r":
        			countr++;
        			break;
        		case "s":
        			counts++;
        			break;
        		case "t":
        			countt++;
        			break;
        		case "u":
        			countu++;
        			break;
        		case "v":
        			countv++;
        			break;
        		case "w":
        			countw++;
        			break;
        		case "x":
        			countx++;
        			break;
        		case "y":
        			county++;
        			break;
        		case "z":
        			countz++;
        			break;
        		}
        		if(counta<mina){
        			mina=counta;
        		}
        		if(countb<minb){
        			minb=countb;
        		}
        		if(countc<minc){
        			minc=countc;
        		}
        		if(countd<mind){
        			mind=countd;
        		}
        		if(counte<mine){
        			mine=counte;
        		}
        		if(countf<minf){
        			minf=countf;
        		}
        		if(countg<ming){
        			ming=countg;
        		}
        		if(counth<minh){
        			minh=counth;
        		}
        		if(counti<mini){
        			mini=counti;
        		}
        		if(countj<minj){
        			minj=countj;
        		}
        		if(countk<mink){
        			mink=countk;
        		}
        		if(countl<minl){
        			minl=countl;
        		}
        		if(countm<minm){
        			minm=countm;
        		}
        		if(countn<minn){
        			minn=countn;
        		}
        		if(counto<mino){
        			mino=counto;
        		}
        		if(countp<minp){
        			minp=countp;
        		}
        		if(countq<minq){
        			minq=countq;
        		}
        		if(countr<minr){
        			minr=countr;
        		}
        		if(counts<mins){
        			mins=counts;
        		}
        		if(countt<mint){
        			mint=countt;
        		}
        		if(countu<minu){
        			minu=countu;
        		}
        		if(countv<minv){
        			minv=countv;
        		}
        		if(countw<minw){
        			minw=countw;
        		}
        		if(countx<minx){
        			minx=countx;
        		}
        		if(county<miny){
        			miny=county;
        		}
        		if(countz<minz){
        			minz=countz;
        		}
        	}
        }
        
        for(int xa=0;xa<mina;xa++){
        	System.out.print("a");
        }
        for(int xb=0;xb<minb;xb++){
        	System.out.print("b");
        }
        for(int xc=0;xc<minc;xc++){
        	System.out.print("c");
        }
        for(int xd=0;xd<mind;xd++){
        	System.out.print("d");
        }
        for(int xe=0;xe<mine;xe++){
        	System.out.print("e");
        }
        for(int xf=0;xf<minf;xf++){
        	System.out.print("f");
        }
        for(int xg=0;xg<ming;xg++){
        	System.out.print("g");
        }
        for(int xh=0;xh<minh;xh++){
        	System.out.print("h");
        }
        for(int xi=0;xi<mini;xi++){
        	System.out.print("i");
        }
        for(int xj=0;xj<minj;xj++){
        	System.out.print("j");
        }
        for(int xk=0;xk<mink;xk++){
        	System.out.print("k");
        }
        for(int xl=0;xl<minl;xl++){
        	System.out.print("l");
        }
        for(int xm=0;xm<minm;xm++){
        	System.out.print("m");
        }
        for(int xn=0;xn<minn;xn++){
        	System.out.print("n");
        }
        for(int xv=0;xv<minv;xv++){
        	System.out.print("v");
        }
        for(int xw=0;xw<minw;xw++){
        	System.out.print("w");
        }
        for(int xx=0;xx<minb;xx++){
        	System.out.print("x");
        }
        for(int xy=0;xy<miny;xy++){
        	System.out.print("y");
        }
        for(int xz=0;xz<minz;xz++){
        	System.out.print("z");
        }
    }
}

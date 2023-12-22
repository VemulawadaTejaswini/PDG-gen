import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,dice1[]=new int[6],dice2[]=new int[6],f=0,swap;
        for(i=0;i<6;i++) {
        	dice1[i]=scan.nextInt();
        }
        for(i=0;i<6;i++) {
        	dice2[i]=scan.nextInt();
        }
        for(i=0;i<4;i++) {
        	if(dice1[0]==dice2[0]) {
        		f+=1;
        		break;
        	}
        	swap=dice2[0];
        	dice2[0]=dice2[1];
        	dice2[1]=dice2[5];
        	dice2[5]=dice2[4];
        	dice2[4]=swap;
        	if(dice1[0]==dice2[0]) {
        		f+=1;
        		break;
        	}
        	swap=dice2[0];
        	dice2[0]=dice2[3];
        	dice2[3]=dice2[5];
        	dice2[5]=dice2[2];
        	dice2[2]=swap;
        }
        if(f==1) {
        	for(i=0;i<5;i++) {
        		if(dice1[1]==dice2[1]) {
        			f+=1;
        			break;
        		}
        		swap=dice2[1];
        		dice2[1]=dice2[2];
        		dice2[2]=dice2[4];
        		dice2[4]=dice2[3];
        		dice2[3]=swap;
        	}
        }
        for(i=0;i<6;i++) {
        	if(dice1[i]==dice2[i]) {
        		f+=1;
        	}
        	else {
        		break;
        	}
        }
        if(f==8) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
    }
}

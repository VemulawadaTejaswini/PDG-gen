import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;


class Cards {
    public int num;
    public int color;
}

public class Main
{      
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int p=0;p<n;p++)
        {
            boolean win = true;

            Cards cards[] = new Cards[9];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<9;j++)
                {
                    cards[j].num=sc.nextInt();
                }
                for(int j=0;j<9;j++)
                {
                    String color = sc.next();
                    if(color=="R")
                        cards[j].color=1;
                    if(color=="G")
                        cards[j].color=2;
                    if(color=="B")
                        cards[j].color=3;                
                }
            
                Arrays.sort( cards, (a,b)-> a.color - b.color );
                int nowcolor=0;

                
                for(int j=0;j<9;j++)
                {

                    if(cards[j].color!=nowcolor)
                    {
                        nowcolor=cards[j].color;

                        int nc_count=0;
                        for(int k=0;k<9;k++){
                            if(cards[k].color==nowcolor)
                                nc_count++;
                        }
                        int nums[]= new int[nc_count];
                        int nc_count2=0;
                        for(int k=0;k<9;k++){
                            if(cards[k].color==nowcolor){
                                nums[nc_count2]=cards[k].num;
                                nc_count2++;
                            } 
                        }
                        Arrays.sort(nums);
                        int same=0;
                        int sames[]=new int[4];
                        int lastnum=-1; 
                    
                        int samecount=0;
                        for(int k=0;k<nums.length;k++)
                        {
                            if(lastnum==nums[k])
                                same++;
                            if(same%3==0)
                            {
                                samecount++;
                                sames[samecount]=nums[k];
                                
                            }
                            lastnum=nums[k];

                        }
                        for(int k=0;k<samecount;k++)
                        {
                            int zerocount =0;
                            for(int l=0;l<9;l++){
                                if(nums[l]==sames[k])
                                    if(zerocount<3)
                                        nums[l]=-1;
                                    zerocount++;      
                            }
                        }
                        Arrays.sort(nums);
                        int lastnum2 = -1;
                        int lastnumcount=0;
                        int lastnumcount3=0;
                        for(int k=0;k<nums.length;k++)
                        {
                            if(nums[k]-1==lastnum)
                                lastnumcount++;
                            if(lastnumcount==2)
                                lastnumcount=0;
                        }
                        if(lastnumcount!=0)
                            win = false;
                    }
                    //nums[j]=cards[j].num; 
                }   
                            
            }
            if(win==true)
                System.out.println("1");
            else
                System.out.println("0");
        }
        sc.close();
    }   
}


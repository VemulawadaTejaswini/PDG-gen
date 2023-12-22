import java.util.*;
public class Main {
public static void main(String[] a){
Scanner s = new Scanner(System.in);int n=Integer.valueOf(s.next());for(;n-->0;){for(int h=0,o=0;o<3;){switch(s.next().charAt(1)) {case'I':h++;if((h&3)==0)h|=3;break;case'O':h+=(((h&3)+1)<<2);h&=~3;break;default:o++;}System.out.println(h>>2)}}}}
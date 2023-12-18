import java.io.*;

public class Game{
    public static void main(String[]args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select level");
                           System.out.println("strong weak");
                           char[][] field;
                           field = new char[3][3];
                           int max = 0;
                           int min = 0;
                           int i,k,m;
                           int[] num;
                           num = new int[8];
                           for(i=0;i<=2;i++)
                           for(k=0;k<=2;k++)
                           field[i][k] = 'O';
                           System.out.println("your turn");
                           for(i=0;i<=2;i++)
                           for(k=0;k<=2;k++)
                           System.out.println(field[i][k]);
                           
                           int move = reader.readLine();
                           
                           switch case(move){
                           case 11:    num[0]++; num[3]++; num[6]++; field[0][0] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 12:    num[3]++; num[1]++; field[0][1] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 13:    num[2]++; num[3]++; num[7]++; field[0][2] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 21:    num[0]++; num[4]++; field[1][0] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 22:    num[1]++; num[4]++; num[6]++;num[7]++;field[1][1] = 'O'; field[0][0] = 'X'; num[0]--; num[3]--; num[6]--;
                           case 23:    num[2]++; num[4]++; field[1][2] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 31:    num[0]++; num[5]++; num[7]++;field[2][0] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 32:    num[1]++; num[5]++; field[2][1] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           case 33:    num[2]++; num[5]++; num[6]++;field[2][2] = 'O'; field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                           }
                           
                           for(m=2;m<=9;m++){
                               System.out.println("your turn");
                               for(i=0;i<=2;i++)
                                   for(k=0;k<=2;k++)
                                       System.out.println(field[i][k]);
                               
                           case 11:    if(field[0][0] == '.'){num[0]++; num[3]++; num[6]++;field[0][0] = 'O';} break;
                           case 12:    if(field[0][1] == '.'){num[3]++; num[1]++;field[0][1] = 'O';} break;
                           case 13:    if(field[0][2] == '.'){num[2]++; num[3]++; num[7]++; field[0][2] = 'O';}break;
                           case 21:    if(field[1][0] == '.'){num[0]++; num[4]++; field[1][0] = 'O';} break;
                           case 22:    if(field[1][1] == '.'){num[1]++; num[4]++; num[6]++;num[7]++;field[1][1] = 'O';} break;
                           case 23:    if(field[1][2] == '.'){num[2]++; num[4]++; field[1][2] = 'O';} break;
                           case 31:    if(field[2][0] == '.'){num[0]++; num[5]++; num[7]++;field[2][0] = 'O';} break;
                           case 32:    if(field[2][1] == '.'){num[1]++; num[5]++; field[2][1] = 'O';} break;
                           case 33:    if(field[2][2] == '.'){num[2]++; num[5]++; num[6]++;field[2][2] = 'O';} break;
                           default: break;
                               for(i=0;i<=2;i++){
                                   if(num[i] > max) max = num[i];
                                   if(num[i] < min) min = num[i];
                               }
                               
                               if(min == -2){
                                   for(i=0;i<=7;i++)
                                       if(num[i] == -2)
                                           break;
                                   switch case(i){
                                   case 0:
                                       if(field[0][0] == '.')     field[0][0] = 'X'; num[0]--; num[3]--; num[6]--;
                                       if(field[1][0] == '.')    field[1][0] = 'X';num[0]--; num[4]--;
                                       if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                       break;
                                   case 1:
                                       if(field[0][1] == '.') field[0][1] = 'X';num[3]--; num[1]--;
                                       if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;
                                       if(field[2][1] == '.') field[2][1] = 'X';num[1]--; num[5]--;
                                       break;
                                   case 2:
                                       if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                       if(field[1][2] == '.') field[1][2] = 'X';num[2]--; num[4]--;
                                       if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                       break;
                                   case 3:
                                       if(field[0][0] == '.') field[0][0] = 'X';num[0]--; num[3]--; num[6]--;
                                       if(field[0][1] == '.') field[0][1] = 'X';num[3]--; num[1]--;
                                       if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                       break;
                                   case 4:
                                       if(field[1][0] == '.') field[1][0] = 'X';num[0]--; num[4]--;
                                       if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;
                                       if(field[1][2] == '.') field[1][2] = 'X';num[2]--; num[4]--;
                                       break;
                                   case 5:
                                       if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                       if(field[2][1] == '.') field[2][1] = 'X';num[1]--; num[5]--;
                                       if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                       break;
                                   case 6:
                                       if(field[0][0] == '.') field[0][0] = 'X';num[0]--; num[3]--; num[6]--;
                                       if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                                       if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                       break;
                                   case 7:
                                       if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                       if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                                       if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                       break;
                                   }
                               }
                               
                               else if(max == 2){
                                   or(i=0;i<=7;i++)
                                   if(num[i] == 2){
                                       break;
                                       switch case(i){
                                       case 0:
                                           if(field[0][0] == '.')     field[0][0] = 'X'; num[0]--; num[3]--; num[6]--;
                                           if(field[1][0] == '.')    field[1][0] = 'X';num[0]--; num[4]--;
                                           if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                           break;
                                       case 1:
                                           if(field[0][1] == '.') field[0][1] = 'X';num[3]--; num[1]--;
                                           if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;
                                           if(field[2][1] == '.') field[2][1] = 'X';num[1]--; num[5]--;
                                           break;
                                       case 2:
                                           if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                           if(field[1][2] == '.') field[1][2] = 'X';num[2]--; num[4]--;
                                           if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                           break;
                                       case 3:
                                           if(field[0][0] == '.') field[0][0] = 'X';num[0]--; num[3]--; num[6]--;
                                           if(field[0][1] == '.') field[0][1] = 'X';num[3]--; num[1]--;
                                           if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                           break;
                                       case 4:
                                           if(field[1][0] == '.') field[1][0] = 'X';num[0]--; num[4]--;
                                           if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;
                                           if(field[1][2] == '.') field[1][2] = 'X';num[2]--; num[4]--;
                                           break;
                                       case 5:
                                           if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                           if(field[2][1] == '.') field[2][1] = 'X';num[1]--; num[5]--;
                                           if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                           break;
                                       case 6:
                                           if(field[0][0] == '.') field[0][0] = 'X';num[0]--; num[3]--; num[6]--;
                                           if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                                           if(field[2][2] == '.') field[2][2] = 'X';num[2]--; num[5]--; num[6]--;
                                           break;
                                       case 7:
                                           if(field[0][2] == '.') field[0][2] = 'X';num[2]--; num[3]--; num[7]--;
                                           if(field[1][1] == '.') field[1][1] = 'X';num[1]--; num[4]--; num[6]--;num[7]--;
                                           if(field[2][0] == '.') field[2][0] = 'X';num[0]--; num[5]--; num[7]--;
                                           break;
                                           
                                       }
                                   }
                                   
                                   
                                   
                                   
                                   
                               }
                           }

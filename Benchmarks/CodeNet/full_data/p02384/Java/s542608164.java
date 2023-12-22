 
AIZU ONLINE JUDGE




PAGETOP

 

???????????????

 

??????????????°

 

???????????????

 

???????????????

 

?????????

 

 





























































































































 
?????°??¢??????
 
??????????¨????
 









??\??¬???   ??±??? 

My Status ?????????????????????     HOME- 





Notes 
 




#2266746 

Solution for ITP1_11_B: Dice II by takedakazuya

?????????????????? ??????????????? ???????????±??????  
    ??¢?????????: public     ?????§??°: 0     





00.05 sec    0 KB    101 lines     1873 bytes    2017-04-18 17:20 




?

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO ?????????????????????????????????????????????
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
 
        int[] dice2 = Dice.Diceget(line1);
 
        String line2 = sc.nextLine();
        int q = Integer.parseInt(line2);
 
        String[] str = new String[q];
        for (int i = 0; i < q; i++) {
            str[i] = sc.nextLine();
        }
 
        for (int i = 0; i < q; i++) {
            String[] sp = str[i].split(" ");
            int X = Integer.parseInt(sp[0]);
            int Y = Integer.parseInt(sp[1]);
 
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    dice2 = Dice.DiceE(dice2);
                    if (dice2[1] == X && dice2[2] == Y) {
                        System.out.println(dice2[3]);
                        break;
                    }
                }
                dice2 = Dice.DiceN(dice2);
                if (dice2[1] == X && dice2[2] == Y) {
                    System.out.println(dice2[3]);
                    break;
                }
            }
             
        }
 
    }
 
}
 
class Dice {
    public static int[] Diceget(String line) {
        int[] set = new int[7];
        String[] s = line.split(" ");
        for (int i = 1; i <= 6; i++) {
            set[i] = Integer.parseInt(s[i-1]);
        }
        return set;
    }
 
    public static int[] DiceE(int[] d){
        int[] dd = new int[7];
        dd[1] = d[4];
        dd[2] = d[2];
        dd[3] = d[1];
        dd[4] = d[6];
        dd[5] = d[5];
        dd[6] = d[3];
        return dd;
    }
 
    public static int[] DiceN(int[] d){
        int[] dd = new int[7];
        dd[1] = d[2];
        dd[2] = d[6];
        dd[3] = d[3];
        dd[4] = d[4];
        dd[5] = d[1];
        dd[6] = d[5];
        return dd;
    }
 
    public static int[] DiceS(int[] d){
        int[] dd = new int[7];
        dd[1] = d[5];
        dd[2] = d[1];
        dd[3] = d[3];
        dd[4] = d[4];
        dd[5] = d[6];
        dd[6] = d[2];
        return dd;
    }
 
    public static int[] DiceW(int[] d){
        int[] dd = new int[7];
        dd[1] = d[3];
        dd[2] = d[2];
        dd[3] = d[6];
        dd[4] = d[1];
        dd[5] = d[5];
        dd[6] = d[4];
        return dd;
    }
}
 



 
private static void rotALL(String input) {
//Loop 25 times, starting with ROT-1 and ending at ROT-25 (every possibliity besides the original input)
    for (int i = 1; i < 26; i++) {
        int rot = 26 - i;
        System.out.print("ROT" + rot + ": ");    
        for (int charIndex = 0; charIndex < input.length(); charIndex++) {
            char c = input.charAt(charIndex);

            int inta = 97; //a in the ASCII table
            int intaWithRot = inta + rot;
            int intA = 65; //A in the ASCII table
            int intAWithRot = intA + rot;

            int intaWithRotPlusOne = intaWithRot + 1;
            int intaWithRotPlusi = intaWithRot + i;
            int intAWithRotPlusOne = intAWithRot + 1;
            int intAWithRotPlusi = intAWithRot + i;

            if (c >= inta && c <= intaWithRot) {
                c += rot;
           } else if (c >= intA && c <= intAWithRot) {
                c += rot;
            } else if (c >= intaWithRotPlusOne && c <= intaWithRotPlusi) {
                c -= rot;
            } else if (c >= intAWithRotPlusOne && c <= intAWithRotPlusi) {
                c -= rot;
            }
            System.out.print(c);
        }
        System.out.println();
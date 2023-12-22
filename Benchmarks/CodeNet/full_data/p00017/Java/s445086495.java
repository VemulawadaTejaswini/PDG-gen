<?php

$kw = array('the', 'this', 'that');
while (TRUE) {
    $s = rtrim(fgets(STDIN));
    if (feof(STDIN)) {
        break;
    }
    for ($i = 0; $i < 26; $i++) {
        $words = explode(' ', str_replace('.', '', $s));
        foreach ($kw as $v) {
            if (in_array($v, $words)) {
                echo $s . PHP_EOL;
                continue 3;
            }
        }
        for ($j = 0; $j < strlen($s); $j++) {
            if ($s[$j] < 'a' || $s[$j] > 'z') {
                continue;
            }
            if ($s[$j] === 'z') {
                $s[$j] = 'a';
            } else {
                $s[$j] = chr(ord($s[$j]) + 1);
            }
        }
    }
}